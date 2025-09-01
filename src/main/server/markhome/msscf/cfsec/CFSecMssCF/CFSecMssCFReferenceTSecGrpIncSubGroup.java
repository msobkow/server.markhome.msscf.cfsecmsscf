
// Description: Java 11 MssCF Reference for TSecGrpInc Relationship SubGroup.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceTSecGrpIncSubGroup binds TSecGrpInc.SubGroup
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceTSecGrpIncSubGroup
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceTSecGrpIncSubGroup() {
		super();
	}

	public CFSecMssCFReferenceTSecGrpIncSubGroup( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpInc",
			"SubGroup",
			"TSecGroup" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceTSecGrpIncSubGroup.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecTSecGroupObj obj;

		if( genDef instanceof ICFSecTSecGrpIncObj ) {
			obj = (ICFSecTSecGroupObj)((ICFSecTSecGrpIncObj)genDef).getRequiredParentSubGroup();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpIncObj" );
		}

		return( obj );
	}
}
