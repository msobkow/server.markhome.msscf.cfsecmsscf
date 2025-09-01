
// Description: Java 11 MssCF Reference for SecGrpInc Relationship SubGroup.

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
 *	CFSecMssCFReferenceSecGrpIncSubGroup binds SecGrpInc.SubGroup
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecGrpIncSubGroup
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecGrpIncSubGroup() {
		super();
	}

	public CFSecMssCFReferenceSecGrpIncSubGroup( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecGrpInc",
			"SubGroup",
			"SecGroup" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecGrpIncSubGroup.dereference() ";

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

		ICFSecSecGroupObj obj;

		if( genDef instanceof ICFSecSecGrpIncObj ) {
			obj = (ICFSecSecGroupObj)((ICFSecSecGrpIncObj)genDef).getRequiredParentSubGroup();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecGrpIncObj" );
		}

		return( obj );
	}
}
