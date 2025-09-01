
// Description: Java 11 MssCF Reference for TSecGrpMemb Relationship User.

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
 *	CFSecMssCFReferenceTSecGrpMembUser binds TSecGrpMemb.User
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceTSecGrpMembUser
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceTSecGrpMembUser() {
		super();
	}

	public CFSecMssCFReferenceTSecGrpMembUser( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpMemb",
			"User",
			"SecUser" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceTSecGrpMembUser.dereference() ";

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

		ICFSecSecUserObj obj;

		if( genDef instanceof ICFSecTSecGrpMembObj ) {
			obj = (ICFSecSecUserObj)((ICFSecTSecGrpMembObj)genDef).getRequiredParentUser();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpMembObj" );
		}

		return( obj );
	}
}
